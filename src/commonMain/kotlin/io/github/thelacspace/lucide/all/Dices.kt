package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dices") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, -2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(17.92f, 14f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(2.24f, 2.24f, 0f, false, false, 0f, -3f)
                lineToRelative(-5f, -4.92f)
                arcToRelative(2.24f, 2.24f, 0f, false, false, -3f, 0f)
                lineTo(10f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 6f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 9f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.DicesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dices: ImageVector
    @Composable get() = DicesDefinition.asImageVector()
