package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lasso") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.704f, 14.467f)
                arcToRelative(10f, 8f, 0f, true, true, 3.115f, 2.375f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                arcToRelative(5f, 5f, 0f, false, true, -2f, -3.994f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.LassoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lasso: ImageVector
    @Composable get() = LassoDefinition.asImageVector()
