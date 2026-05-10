package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BotMessageSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 11f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 16f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(8.828f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, .586f)
                lineToRelative(-2.202f, 2.202f)
                arcTo(.71f, .71f, 0f, false, true, 4f, 20.286f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 11f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.BotMessageSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BotMessageSquare: ImageVector
    @Composable get() = BotMessageSquareDefinition.asImageVector()
