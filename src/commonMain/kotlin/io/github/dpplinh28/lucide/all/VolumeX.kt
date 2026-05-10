package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VolumeX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 4.702f)
                arcToRelative(.705f, .705f, 0f, false, false, -1.203f, -.498f)
                lineTo(6.413f, 7.587f)
                arcTo(1.4f, 1.4f, 0f, false, true, 5.416f, 8f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2.416f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, .997f, .413f)
                lineToRelative(3.383f, 3.384f)
                arcTo(.705f, .705f, 0f, false, false, 11f, 19.298f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                lineTo(16f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 9f)
                lineTo(22f, 15f)
            }
}

public val LucideIcons.All.VolumeXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VolumeX: ImageVector
    @Composable get() = VolumeXDefinition.asImageVector()
