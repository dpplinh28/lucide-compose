package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Currency") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                lineTo(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 3f)
                lineTo(18f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 21f)
                lineTo(6f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 21f)
                lineTo(18f, 18f)
            }
}

public val LucideIcons.All.CurrencyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Currency: ImageVector
    @Composable get() = CurrencyDefinition.asImageVector()
