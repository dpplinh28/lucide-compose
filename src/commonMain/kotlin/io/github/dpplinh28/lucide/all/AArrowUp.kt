package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14f, 11f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 16f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 16f)
                lineToRelative(4.039f, -9.69f)
                arcToRelative(.5f, .5f, 0f, false, true, .923f, 0f)
                lineTo(11f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.304f, 13f)
                horizontalLineToRelative(6.392f)
            }
}

public val LucideIcons.All.AArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AArrowUp: ImageVector
    @Composable get() = AArrowUpDefinition.asImageVector()
