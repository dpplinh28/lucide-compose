package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PointerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 4.5f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2.41f, -1.957f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f, 8.4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.26f, -1.295f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.7f, 16.2f)
                arcTo(8f, 8f, 0f, false, false, 22f, 14f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -3.63f, -1.158f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 15f)
                lineToRelative(-1.8f, -1.8f)
                arcToRelative(2f, 2f, 0f, false, false, -2.79f, 2.86f)
                lineTo(6f, 19.7f)
                arcToRelative(7.74f, 7.74f, 0f, false, false, 6f, 2.3f)
                horizontalLineToRelative(2f)
                arcToRelative(8f, 8f, 0f, false, false, 5.657f, -2.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 6f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.PointerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PointerOff: ImageVector
    @Composable get() = PointerOffDefinition.asImageVector()
