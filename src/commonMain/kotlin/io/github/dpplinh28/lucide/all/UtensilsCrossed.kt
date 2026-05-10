package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UtensilsCrossed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 2f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 4.2f)
                lineToRelative(1.8f, 1.8f)
                arcToRelative(3f, 3f, 0f, false, false, 4.2f, 0f)
                lineTo(22f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 15f)
                lineTo(3.3f, 3.3f)
                arcToRelative(4.2f, 4.2f, 0f, false, false, 0f, 6f)
                lineToRelative(7.3f, 7.3f)
                curveToRelative(.7f, .7f, 2f, .7f, 2.8f, 0f)
                lineTo(15f, 15f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(7f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2.1f, 21.8f)
                lineToRelative(6.4f, -6.3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 5f)
                lineToRelative(-7f, 7f)
            }
}

public val LucideIcons.All.UtensilsCrossedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UtensilsCrossed: ImageVector
    @Composable get() = UtensilsCrossedDefinition.asImageVector()
