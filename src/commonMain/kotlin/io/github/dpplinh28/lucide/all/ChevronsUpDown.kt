package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsUpDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 15f)
                lineToRelative(5f, 5f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 9f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 5f)
            }
}

public val LucideIcons.All.ChevronsUpDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsUpDown: ImageVector
    @Composable get() = ChevronsUpDownDefinition.asImageVector()
