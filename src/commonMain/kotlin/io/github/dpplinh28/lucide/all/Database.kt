package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
