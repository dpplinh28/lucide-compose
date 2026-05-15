package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitMergeConflict") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                verticalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                lineTo(3f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                lineTo(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.GitMergeConflictDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitMergeConflict: ImageVector
    @Composable get() = GitMergeConflictDefinition.asImageVector()
