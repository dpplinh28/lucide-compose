package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EqualApproximately") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 15f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 7f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 7f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 9f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 7f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 7f, 0f)
            }
}

public val LucideIcons.All.EqualApproximatelyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EqualApproximately: ImageVector
    @Composable get() = EqualApproximatelyDefinition.asImageVector()
