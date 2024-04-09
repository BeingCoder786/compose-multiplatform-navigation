package screen.detail

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel : ScreenModel {

    private var _number: MutableStateFlow<Int> = MutableStateFlow(0)
    val numberr: StateFlow<Int> = _number

    init {
        println("viewmodel initilized")
        screenModelScope.launch {
            delay(2000)
            _number.value = 10
        }
    }

    override fun onDispose() {
        super.onDispose()
        println("viewmodel destroyed")
    }
}
