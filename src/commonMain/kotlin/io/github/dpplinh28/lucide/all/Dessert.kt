package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dessert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.162f, 3.167f)
                arcTo(10f, 10f, 0f, false, false, 2f, 13f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, -.006f)
                arcToRelative(10f, 10f, 0f, false, false, -8.161f, -9.826f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.804f, 14.869f)
                arcToRelative(9f, 9f, 0f, false, true, -17.608f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.DessertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dessert: ImageVector
    @Composable get() = DessertDefinition.asImageVector()
