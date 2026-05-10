package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsRightLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(20f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 17f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
            }
}

public val LucideIcons.All.ChevronsRightLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsRightLeft: ImageVector
    @Composable get() = ChevronsRightLeftDefinition.asImageVector()
