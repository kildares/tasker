package matcher.game.silveira.avila.com.tasker.dependencyinjection

import dagger.Module
import dagger.android.ContributesAndroidInjector
import matcher.game.silveira.avila.com.tasker.viewmodel.ItemsFragment

@Module
abstract class FragmentBuildersModule{

    @ContributesAndroidInjector
    abstract fun contributeItemsFragment() : ItemsFragment

}