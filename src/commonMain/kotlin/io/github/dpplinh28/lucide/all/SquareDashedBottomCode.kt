package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedBottomCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 9.5f)
                lineTo(8f, 12f)
                lineToRelative(2f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 9.5f)
                lineToRelative(2f, 2.5f)
                lineToRelative(-2f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineToRelative(1f)
            }
}

public val LucideIcons.All.SquareDashedBottomCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedBottomCode: ImageVector
    @Composable get() = SquareDashedBottomCodeDefinition.asImageVector()
