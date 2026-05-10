package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacGemini") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 4.525f)
                verticalLineToRelative(14.948f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 3f)
                arcTo(17f, 17f, 0f, false, true, 4f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 21f)
                arcToRelative(17f, 17f, 0f, false, true, 16f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 4.525f)
                verticalLineToRelative(14.948f)
            }
}

public val LucideIcons.All.ZodiacGeminiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacGemini: ImageVector
    @Composable get() = ZodiacGeminiDefinition.asImageVector()
