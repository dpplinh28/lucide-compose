package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 4f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 16f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 9f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 9f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.8f, 11.8f)
                lineTo(19f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.8f, 6.2f)
                lineTo(19f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 21f)
                lineToRelative(9f, -9f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.2f, 6.2f)
                lineTo(11f, 5f)
            }
}

public val LucideIcons.All.WandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wand: ImageVector
    @Composable get() = WandDefinition.asImageVector()
