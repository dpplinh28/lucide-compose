package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RepeatOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.656f, 6f)
                horizontalLineTo(21f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.898f, 17.898f)
                arcTo(4f, 4f, 0f, false, true, 17f, 18f)
                horizontalLineTo(3f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, true, -.171f, 1.159f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 6f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                verticalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, false, true, 3.102f, -3.898f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 22f)
                lineToRelative(-4f, -4f)
            }
}

public val LucideIcons.All.RepeatOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RepeatOff: ImageVector
    @Composable get() = RepeatOffDefinition.asImageVector()
