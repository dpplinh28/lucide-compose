package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwissFranc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 21f)
                verticalLineTo(3f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 16f)
                horizontalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 9.5f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.SwissFrancDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwissFranc: ImageVector
    @Composable get() = SwissFrancDefinition.asImageVector()
