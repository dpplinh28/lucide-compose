package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingBasket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 11f)
                lineToRelative(-1f, 9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 11f)
                lineToRelative(-4f, -7f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 11f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3.5f, 11f)
                lineToRelative(1.6f, 7.4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 1.6f)
                horizontalLineToRelative(9.8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -1.6f)
                lineToRelative(1.7f, -7.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f, 15.5f)
                horizontalLineToRelative(15f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 11f)
                lineToRelative(4f, -7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 11f)
                lineToRelative(1f, 9f)
            }
}

public val LucideIcons.All.ShoppingBasketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingBasket: ImageVector
    @Composable get() = ShoppingBasketDefinition.asImageVector()
