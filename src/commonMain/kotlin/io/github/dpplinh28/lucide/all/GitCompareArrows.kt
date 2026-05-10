package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitCompareArrows") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 9f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 15f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
}

public val LucideIcons.All.GitCompareArrowsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitCompareArrows: ImageVector
    @Composable get() = GitCompareArrowsDefinition.asImageVector()
