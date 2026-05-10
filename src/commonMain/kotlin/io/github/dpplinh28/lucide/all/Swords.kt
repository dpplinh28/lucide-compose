package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Swords") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.5f, 17.5f)
                lineTo(3f, 6f)
                lineTo(3f, 3f)
                lineTo(6f, 3f)
                lineTo(17.5f, 14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 19f)
                lineTo(19f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                lineTo(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                lineTo(21f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f, 6.5f)
                lineTo(18f, 3f)
                lineTo(21f, 3f)
                lineTo(21f, 6f)
                lineTo(17.5f, 9.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 14f)
                lineTo(9f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 17f)
                lineTo(4f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                lineTo(5f, 21f)
            }
}

public val LucideIcons.All.SwordsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Swords: ImageVector
    @Composable get() = SwordsDefinition.asImageVector()
