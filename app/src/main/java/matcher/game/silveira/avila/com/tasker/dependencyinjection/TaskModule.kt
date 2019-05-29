package matcher.game.silveira.avila.com.tasker.dependencyinjection

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import matcher.game.silveira.avila.com.tasker.db.TaskDao
import matcher.game.silveira.avila.com.tasker.db.TaskerDatabase

@Module(includes = [ItemViewModelModule::class])
class TaskModule {

    @Provides
    fun provideDatabase(app : Application) : TaskerDatabase{

        return Room.databaseBuilder(app, TaskerDatabase::class.java, "task.db")
            .fallbackToDestructiveMigration().build()
    }


    @Provides
    fun provideTaskDao(db : TaskerDatabase) : TaskDao{
        return db.taskDao()
    }

}
