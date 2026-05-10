package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Anchor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 13f)
                lineToRelative(2f, -1f)
                arcToRelative(9f, 9f, 0f, false, true, -18f, 0f)
                lineToRelative(2f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 11f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.AnchorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Anchor: ImageVector
    @Composable get() = AnchorDefinition.asImageVector()
