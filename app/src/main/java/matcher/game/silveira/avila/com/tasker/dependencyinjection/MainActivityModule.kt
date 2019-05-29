package matcher.game.silveira.avila.com.tasker.dependencyinjection

import dagger.Module
import dagger.android.ContributesAndroidInjector
import matcher.game.silveira.avila.com.tasker.MainActivity

@Suppress("unused")
@Module
abstract class MainActivityModule{

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity() : MainActivity
}