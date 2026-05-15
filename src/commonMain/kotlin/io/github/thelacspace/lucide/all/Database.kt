package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Database") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                arcTo(9f, 3f, 0f, false, false, 21f, 19f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcTo(9f, 3f, 0f, false, false, 21f, 12f)
            }
}

public val LucideIcons.All.DatabaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Database: ImageVector
    @Composable get() = DatabaseDefinition.asImageVector()
