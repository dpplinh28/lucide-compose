package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 10f)
                arcToRelative(4f, 4f, 0f, false, true, -8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.103f, 6.034f)
                horizontalLineToRelative(17.794f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4f, 5.467f)
                arcToRelative(2f, 2f, 0f, false, false, -.4f, 1.2f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6.667f)
                arcToRelative(2f, 2f, 0f, false, false, -.4f, -1.2f)
                lineToRelative(-2f, -2.667f)
                arcTo(2f, 2f, 0f, false, false, 17f, 2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -1.6f, .8f)
                close()
            }
}

public val LucideIcons.All.ShoppingBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingBag: ImageVector
    @Composable get() = ShoppingBagDefinition.asImageVector()
