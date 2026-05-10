package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IndianRupee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 3f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 13f)
                lineToRelative(8.5f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 13f)
                curveToRelative(6.667f, 0f, 6.667f, -10f, 0f, -10f)
            }
}

public val LucideIcons.All.IndianRupeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IndianRupee: ImageVector
    @Composable get() = IndianRupeeDefinition.asImageVector()
