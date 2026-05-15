package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsLeftRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(9f, 7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 7f)
                lineToRelative(5f, 5f)
                lineToRelative(-5f, 5f)
            }
}

public val LucideIcons.All.ChevronsLeftRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsLeftRight: ImageVector
    @Composable get() = ChevronsLeftRightDefinition.asImageVector()
