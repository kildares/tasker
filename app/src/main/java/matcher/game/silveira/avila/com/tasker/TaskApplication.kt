package matcher.game.silveira.avila.com.tasker

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import matcher.game.silveira.avila.com.tasker.dependencyinjection.AppInjector
import javax.inject.Inject

class TaskApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector : DispatchingAndroidInjector<Activity>


    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector


    override fun onCreate() {
        super.onCreate()

        AppInjector.init(this)
    }
}