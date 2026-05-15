package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14f, 12f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
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

public val LucideIcons.All.AArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AArrowDown: ImageVector
    @Composable get() = AArrowDownDefinition.asImageVector()
