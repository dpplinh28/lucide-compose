package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitGraph") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 9f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 15.7f)
                arcTo(9f, 9f, 0f, false, false, 19f, 9f)
            }
}

public val LucideIcons.All.GitGraphDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitGraph: ImageVector
    @Composable get() = GitGraphDefinition.asImageVector()
