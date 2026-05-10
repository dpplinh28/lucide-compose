package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CupSoda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(6f, 8f)
                lineToRelative(1.75f, 12.28f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 1.72f)
                horizontalLineToRelative(4.54f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -1.72f)
                lineTo(18f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 15f)
                arcToRelative(6.47f, 6.47f, 0f, false, true, 5f, 0f)
                arcToRelative(6.47f, 6.47f, 0f, false, false, 5f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 8f)
                lineToRelative(1f, -6f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.CupSodaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CupSoda: ImageVector
    @Composable get() = CupSodaDefinition.asImageVector()
