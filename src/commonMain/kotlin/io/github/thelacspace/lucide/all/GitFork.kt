package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitFork") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 9f)
                verticalLineToRelative(2f)
                curveToRelative(0f, .6f, -.4f, 1f, -1f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-.6f, 0f, -1f, -.4f, -1f, -1f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.GitForkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitFork: ImageVector
    @Composable get() = GitForkDefinition.asImageVector()
