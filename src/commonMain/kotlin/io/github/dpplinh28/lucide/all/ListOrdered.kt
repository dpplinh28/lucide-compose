package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListOrdered") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 5f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 12f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 19f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 9f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f, 20f)
                horizontalLineTo(3.4f)
                curveToRelative(0f, -1f, 2.6f, -1.925f, 2.6f, -3.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.6f, -1.02f)
            }
}

public val LucideIcons.All.ListOrderedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListOrdered: ImageVector
    @Composable get() = ListOrderedDefinition.asImageVector()
