package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextQuote") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                verticalLineToRelative(7f)
            }
}

public val LucideIcons.All.TextQuoteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextQuote: ImageVector
    @Composable get() = TextQuoteDefinition.asImageVector()
