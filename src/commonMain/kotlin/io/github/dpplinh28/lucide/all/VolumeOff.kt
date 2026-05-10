package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VolumeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 9f)
                arcToRelative(5f, 5f, 0f, false, true, .95f, 2.293f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.364f, 5.636f)
                arcToRelative(9f, 9f, 0f, false, true, 1.889f, 9.96f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 7f)
                lineToRelative(-.587f, .587f)
                arcTo(1.4f, 1.4f, 0f, false, true, 5.416f, 8f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2.416f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, .997f, .413f)
                lineToRelative(3.383f, 3.384f)
                arcTo(.705f, .705f, 0f, false, false, 11f, 19.298f)
                verticalLineTo(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.828f, 4.172f)
                arcTo(.686f, .686f, 0f, false, true, 11f, 4.657f)
                verticalLineToRelative(.686f)
            }
}

public val LucideIcons.All.VolumeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VolumeOff: ImageVector
    @Composable get() = VolumeOffDefinition.asImageVector()
