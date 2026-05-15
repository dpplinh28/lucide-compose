package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AudioWaveform") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
}

public val LucideIcons.All.AudioWaveformDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AudioWaveform: ImageVector
    @Composable get() = AudioWaveformDefinition.asImageVector()
