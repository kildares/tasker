package matcher.game.silveira.avila.com.tasker.dependencyinjection

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import matcher.game.silveira.avila.com.tasker.TaskApplication
import javax.inject.Singleton

//This class will build dependencies for the Application
@Singleton
@Component(modules = [AndroidInjectionModule::class, MainActivityModule::class, TaskModule::class])
interface ApplicationComponent{

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(app : Application) : Builder

        fun build() : ApplicationComponent

    }

    fun inject(app : TaskApplication)
}