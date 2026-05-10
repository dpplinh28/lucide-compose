package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesCombined") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 10f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 3f)
                lineToRelative(-8.646f, 8.646f)
                arcToRelative(.5f, .5f, 0f, false, true, -.708f, 0f)
                lineTo(9.354f, 8.354f)
                arcToRelative(.5f, .5f, 0f, false, false, -.707f, 0f)
                lineTo(2f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                verticalLineToRelative(7f)
            }
}

public val LucideIcons.All.ChartNoAxesCombinedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesCombined: ImageVector
    @Composable get() = ChartNoAxesCombinedDefinition.asImageVector()
