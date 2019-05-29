package matcher.game.silveira.avila.com.tasker.dependencyinjection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import matcher.game.silveira.avila.com.tasker.viewmodel.ItemsViewModel

@Module
abstract class ItemViewModelModule{

    @Binds
    @IntoMap
    @ViewModelKey(ItemsViewModel::class)
    abstract fun bindItemViewModel(itemsViewModel: ItemsViewModel) : ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory : TaskViewModelFactory) : ViewModelProvider.Factory
}