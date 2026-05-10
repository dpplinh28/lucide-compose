package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitBranchMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 6f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, 9f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 18f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.GitBranchMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitBranchMinus: ImageVector
    @Composable get() = GitBranchMinusDefinition.asImageVector()
