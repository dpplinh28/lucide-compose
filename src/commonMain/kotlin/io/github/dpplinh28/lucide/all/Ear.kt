package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ear") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 8.5f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, 13f, 0f)
                curveToRelative(0f, 6f, -6f, 6f, -6f, 10f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
            }
}

public val LucideIcons.All.EarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ear: ImageVector
    @Composable get() = EarDefinition.asImageVector()
