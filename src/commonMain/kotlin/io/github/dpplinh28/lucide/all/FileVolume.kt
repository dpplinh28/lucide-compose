package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileVolume") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 11.55f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.706f, .706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-1.95f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14.502f)
                arcToRelative(.5f, .5f, 0f, false, false, -.826f, -.381f)
                lineToRelative(-1.893f, 1.631f)
                arcToRelative(1f, 1f, 0f, false, true, -.651f, .243f)
                horizontalLineTo(3.5f)
                arcToRelative(.5f, .5f, 0f, false, false, -.5f, .501f)
                verticalLineToRelative(3.006f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, .501f)
                horizontalLineToRelative(1.129f)
                arcToRelative(1f, 1f, 0f, false, true, .652f, .243f)
                lineToRelative(1.893f, 1.633f)
                arcToRelative(.5f, .5f, 0f, false, false, .826f, -.38f)
                close()
            }
}

public val LucideIcons.All.FileVolumeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileVolume: ImageVector
    @Composable get() = FileVolumeDefinition.asImageVector()
