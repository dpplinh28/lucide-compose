package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitBranchPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 3f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 9f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 21f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 6f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 15f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 18f)
                horizontalLineToRelative(-6f)
            }
}

public val LucideIcons.All.GitBranchPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitBranchPlus: ImageVector
    @Composable get() = GitBranchPlusDefinition.asImageVector()
