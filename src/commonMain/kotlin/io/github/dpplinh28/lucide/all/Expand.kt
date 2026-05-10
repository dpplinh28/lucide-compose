package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Expand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 15f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 9f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 16f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                verticalLineTo(3f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 16f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 21f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 8f)
                verticalLineTo(3f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                lineTo(3f, 3f)
            }
}

public val LucideIcons.All.ExpandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Expand: ImageVector
    @Composable get() = ExpandDefinition.asImageVector()
