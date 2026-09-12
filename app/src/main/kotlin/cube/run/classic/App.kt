package cube.run.classic

import android.app.Application
import cube.run.classic.core.Haptics
import cube.run.classic.core.Scores
import cube.run.classic.core.Settings
import cube.run.classic.core.SoundFx

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Scores.init(this)
        Settings.init(this)
        Haptics.init(this)
        SoundFx.init(this)
    }
}
