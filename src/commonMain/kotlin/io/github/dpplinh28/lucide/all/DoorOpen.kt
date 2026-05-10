package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 20f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 4.562f)
                verticalLineToRelative(16.157f)
                arcToRelative(1f, 1f, 0f, false, false, 1.242f, .97f)
                lineTo(19f, 20f)
                verticalLineTo(5.562f)
                arcToRelative(2f, 2f, 0f, false, false, -1.515f, -1.94f)
                lineToRelative(-4f, -1f)
                arcTo(2f, 2f, 0f, false, false, 11f, 4.561f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 4f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 20f)
                horizontalLineToRelative(-3f)
            }
}

public val LucideIcons.All.DoorOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorOpen: ImageVector
    @Composable get() = DoorOpenDefinition.asImageVector()
