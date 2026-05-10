package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronFirst") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17f, 18f)
                lineToRelative(-6f, -6f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 6f)
                verticalLineToRelative(12f)
            }
}

public val LucideIcons.All.ChevronFirstDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronFirst: ImageVector
    @Composable get() = ChevronFirstDefinition.asImageVector()
