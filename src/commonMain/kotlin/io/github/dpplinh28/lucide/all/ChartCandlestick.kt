package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartCandlestick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 5f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 15f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 13f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
}

public val LucideIcons.All.ChartCandlestickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartCandlestick: ImageVector
    @Composable get() = ChartCandlestickDefinition.asImageVector()
