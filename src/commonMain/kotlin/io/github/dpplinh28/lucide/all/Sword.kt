package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sword") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 19f)
                lineToRelative(-6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 21f)
                lineToRelative(-2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 16f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 17.5f)
                lineTo(21f, 6f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                lineTo(6.5f, 14.5f)
            }
}

public val LucideIcons.All.SwordDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sword: ImageVector
    @Composable get() = SwordDefinition.asImageVector()
