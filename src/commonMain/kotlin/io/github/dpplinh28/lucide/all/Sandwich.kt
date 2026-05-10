package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sandwich") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2.37f, 11.223f)
                lineToRelative(8.372f, -6.777f)
                arcToRelative(2f, 2f, 0f, false, true, 2.516f, 0f)
                lineToRelative(8.371f, 6.777f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 15f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-5.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 15f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.67f, 15f)
                lineToRelative(6.13f, 4.6f)
                arcToRelative(2f, 2f, 0f, false, false, 2.8f, -.4f)
                lineToRelative(3.15f, -4.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.SandwichDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sandwich: ImageVector
    @Composable get() = SandwichDefinition.asImageVector()
