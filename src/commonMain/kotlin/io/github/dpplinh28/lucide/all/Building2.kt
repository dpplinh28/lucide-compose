package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Building2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 10f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 21f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(16f)
            }
}

public val LucideIcons.All.Building2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Building2: ImageVector
    @Composable get() = Building2Definition.asImageVector()
