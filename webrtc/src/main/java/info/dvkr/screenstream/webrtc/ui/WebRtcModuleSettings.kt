package info.dvkr.screenstream.webrtc.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import info.dvkr.screenstream.common.ModuleSettings
import info.dvkr.screenstream.webrtc.R
import info.dvkr.screenstream.webrtc.WebRtcStreamingModule
import info.dvkr.screenstream.webrtc.ui.settings.GeneralGroup

internal object WebRtcModuleSettings : ModuleSettings {
    override val id: String = WebRtcStreamingModule.Id.value
    override val groups: List<ModuleSettings.Group> =
        listOf(GeneralGroup).sortedBy { it.position }

    @Composable
    override fun TitleUI(horizontalPadding: Dp, modifier: Modifier) {
        Text(
            text = stringResource(id = R.string.webrtc_pref_header),
            modifier = modifier
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
                .padding(horizontal = horizontalPadding + 16.dp, vertical = 8.dp)
                .fillMaxWidth(),
            fontSize = 18.sp,
            style = MaterialTheme.typography.titleMedium
        )
    }
}